class Solution {
        class Trie {
                Trie[] child = new Trie[26];
                        String word;
                            }

                                Trie root = new Trie();
                                    List<String> ans = new ArrayList<>();

                                        public List<String> findWords(char[][] board, String[] words) {
                                                for (String word : words)
                                                            add(word);

                                                                    for (int i = 0; i < board.length; i++)
                                                                                for (int j = 0; j < board[0].length; j++)
                                                                                                dfs(board, i, j, root);

                                                                                                        return ans;
                                                                                                            }

                                                                                                                void add(String s) {
                                                                                                                        Trie cur = root;

                                                                                                                                for (char c : s.toCharArray()) {
                                                                                                                                            int i = c - 'a';
                                                                                                                                                        if (cur.child[i] == null)
                                                                                                                                                                        cur.child[i] = new Trie();
                                                                                                                                                                                    cur = cur.child[i];
                                                                                                                                                                                            }

                                                                                                                                                                                                    cur.word = s;
                                                                                                                                                                                                        }

                                                                                                                                                                                                            void dfs(char[][] b, int r, int c, Trie node) {
                                                                                                                                                                                                                    if (r < 0 || c < 0 || r >= b.length || c >= b[0].length)
                                                                                                                                                                                                                                return;

                                                                                                                                                                                                                                        char ch = b[r][c];

                                                                                                                                                                                                                                                if (ch == '#' || node.child[ch - 'a'] == null)
                                                                                                                                                                                                                                                            return;

                                                                                                                                                                                                                                                                    node = node.child[ch - 'a'];

                                                                                                                                                                                                                                                                            if (node.word != null) {
                                                                                                                                                                                                                                                                                        ans.add(node.word);
                                                                                                                                                                                                                                                                                                    node.word = null;
                                                                                                                                                                                                                                                                                                            }

                                                                                                                                                                                                                                                                                                                    b[r][c] = '#';

                                                                                                                                                                                                                                                                                                                            dfs(b, r + 1, c, node);
                                                                                                                                                                                                                                                                                                                                    dfs(b, r - 1, c, node);
                                                                                                                                                                                                                                                                                                                                            dfs(b, r, c + 1, node);
                                                                                                                                                                                                                                                                                                                                                    dfs(b, r, c - 1, node);

                                                                                                                                                                                                                                                                                                                                                            b[r][c] = ch;
                                                                                                                                                                                                                                                                                                                                                                
                                                                                                                                                                                                                                                                                                                                                                }
}