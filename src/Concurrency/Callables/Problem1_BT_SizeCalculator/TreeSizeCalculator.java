package Concurrency.Callables.Problem1_BT_SizeCalculator;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public class TreeSizeCalculator implements Callable<Integer> {
    Node root;
    ExecutorService executorService;

    public TreeSizeCalculator(Node root, ExecutorService executorService) {
        this.root = root;
        this.executorService = executorService;
    }

    @Override
    public Integer call() throws Exception {
        if (this.root == null) return 0;

        TreeSizeCalculator leftSubTree = new TreeSizeCalculator(root.left, executorService);
        TreeSizeCalculator rightSubTree = new TreeSizeCalculator(root.right, executorService);

        int left = executorService.submit(leftSubTree).get();
        int right = executorService.submit(rightSubTree).get();

        return left + right + 1;

    }
}
