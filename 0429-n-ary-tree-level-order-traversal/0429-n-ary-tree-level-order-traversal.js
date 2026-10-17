var levelOrder = function(root) {
    if (!root) return [];
    const result = [];
    const queue = [root];

    while (queue.length > 0) {
        const levelSize = queue.length;
        const level = [];

        for (let i = 0; i < levelSize; i++) {
            const node = queue.shift();
            level.push(node.val);
            for (const child of node.children) {
                queue.push(child);
            }
        }
        result.push(level);
    }
    return result;
};