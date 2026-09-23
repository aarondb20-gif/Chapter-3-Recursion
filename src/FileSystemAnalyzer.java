public class FileSystemAnalyzer {

    public static int countFilesRecursive(FileSystemItem item){
        //if item is a Folder start counter at 0
        if(!(item instanceof Folder))
            return 1;
        int sum = 0;
        //cast Folder
        Folder temp = (Folder) item;
        //loop through each FileSystemItem in folder.getItems
        //add each to counter, return total sum
        for(FileSystemItem i : temp.getItems()){
            sum += countFilesRecursive(i);

        }
        return sum;
        }


    }

