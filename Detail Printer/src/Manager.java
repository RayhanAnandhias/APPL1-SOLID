import java.util.Collection;
import java.util.Collections;

public class Manager extends Employee {
    public Collection<String> Documents;

    public Manager(String name, Collection<String> documents) {
        super(name);
        this.Documents = documents;
        this.Documents = Collections.unmodifiableCollection(Documents);
    }

    public Collection<String> getDocuments() {
        return Documents;
    }

    public void setDocuments(Collection<String> documents) {
        Documents = documents;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + String.join("\n", getDocuments());
    }
}
