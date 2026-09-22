class Solution {
        public String[] findWords(String[] words) {
                String[] rows = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
                        List<String> ans = new ArrayList<>();

                                for (String word : words) {
                                            String w = word.toLowerCase();

                                                        for (String row : rows) {
                                                                        boolean ok = true;

                                                                                        for (char c : w.toCharArray()) {
                                                                                                            if (!row.contains("" + c)) {
                                                                                                                                    ok = false;
                                                                                                                                                            break;
                                                                                                                                                                                }
                                                                                                                                                                                                }

                                                                                                                                                                                                                if (ok) {
                                                                                                                                                                                                                                    ans.add(word);
                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                            }

                                                                                                                                                                                                                                                                                                    return ans.toArray(new String[0]);
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                        }
