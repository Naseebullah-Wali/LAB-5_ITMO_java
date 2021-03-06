package Data;

public class Organization {
    private int id;
    private String name;
    private String fullname;
    private OrganizationType type;
    private Address officialAddress;
    public Organization(int id, String name, String fulname, OrganizationType type, Address officialAddress){
        this.id=id;
        this.name=name;
        this.fullname=fulname;
        this.type=type;
        this.officialAddress=officialAddress;
    }

    public Organization() {

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFullname() {
        return fullname;
    }

    public OrganizationType getType() {
        return type;
    }

    public Address getOfficialAddress() {
        return officialAddress;
    }

    @Override
    public String toString() {
        String info = "More Informaion See Below\n";

        info += ("Manufacturer: \n");
        info += ("             id: " + id + '\n');
        info += ("             name: " + name + '\n');
        info += ("             Full-Name: " + fullname+ '\n');
        info += ("             Type of Organization: " + type + '\n');
        info += ("             Officai-Address: " + officialAddress + '\n');
        return info;

    }

}
