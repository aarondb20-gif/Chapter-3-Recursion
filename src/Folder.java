import java.util.ArrayList;

public class Folder implements FileSystemItem{
    private String name;
    private ArrayList<FileSystemItem> items;


    public Folder(String name){
        this.name = name;
        this.items = new ArrayList<FileSystemItem>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSizeInKB() {
        return items.size();
    }

    public void addItem(FileSystemItem item){
        items.add(item);

    }
    public ArrayList<FileSystemItem> getItems() {

        return items;
    }
}
