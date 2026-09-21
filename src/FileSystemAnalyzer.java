public class FileSystemAnalyzer {
    static FileSystemItem FileItem = null;
    public static int countFilesRecursive(FileSystemItem item, int index){
        if(item.equals(FileItem)) return 1;
        return countFilesRecursive(item, index + 1);

        }


    }

