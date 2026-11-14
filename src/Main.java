import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Folder root = new Folder("root");
        Folder photos = new Folder("Photos");
        Folder doc = new Folder("Documents");
        Folder vac = new Folder("vacations");
        doc.addItem(new FileItem("doc1", 15));
        doc.addItem(new FileItem("doc2",14));
        vac.addItem(new FileItem("photo4", 23));
        photos.addItem(new FileItem("photos",24));
        photos.addItem(new FileItem("photos2",25));
        photos.addItem(new FileItem("photos3",26));
        photos.addItem(vac);
        root.addItem(photos);
        root.addItem(doc);

        //add callCount accumulator and print number of method invokes
        int[] callCount = {0};
        System.out.println("Total Files: " + FileSystemAnalyzer.countFilesRecursive(root, callCount));
        System.out.println("Total Calls: " + callCount[0]);

    }
}
