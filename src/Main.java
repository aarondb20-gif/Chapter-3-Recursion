import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Folder root = new Folder("root");
        Folder photos = new Folder("Photos");
        Folder doc = new Folder("Documents");
        Folder vac = new Folder("vacations");
        doc.addItem(new FileItem("doc1", 15));
        doc.addItem(new FileItem("doc2",15));
        vac.addItem(new FileItem("photo4", 23));
        photos.addItem(new FileItem("photos",23));
        photos.addItem(new FileItem("photos2",23));
        photos.addItem(new FileItem("photos3",23));
        photos.addItem(vac);
        root.addItem(photos);
        root.addItem(doc);

        System.out.println(FileSystemAnalyzer.countFilesRecursive(root));
    }
}
