import java.util.Stack;

public class FileSystemAnalyzer {

    public static int countFilesRecursive(FileSystemItem item, int[] callCount){
        callCount[0]++;
        if(item == null) return 0;
        //If the current item is a file (not a Folder), the recursion stops and returns 1.
        if(!(item instanceof Folder folder)) return 1;
        int sum = 0;
        for(FileSystemItem file : folder.getItems()){
            sum += countFilesRecursive(file, callCount);

        }
        return sum;
        }
    //file items will be added to sum
    //cast Folder
    //loop through each FileSystemItem in folder.getItems
    //add each to counter, return total sum

    public static int countFilesIterative(FileSystemItem item) {
        if (item == null) return 0;
        if (!(item instanceof Folder)) return 1;

        int sum = 0;
        Stack<FileSystemItem> stack = new Stack<>();
        stack.push(item);

        while (!stack.isEmpty()) {
            FileSystemItem current = stack.pop();

            if (current instanceof Folder) {
                Folder folder = (Folder) current;
                for (FileSystemItem file : folder.getItems()) {
                    stack.push(file);
                }
            } else {
                sum++;
            }
        }
        return sum;
    }

}

