package SS16_IO_Text_File.Exercise;

public class Country {
    private int id;
    private String code;
    private String name_country;

    public Country() {
    }

    public Country(int id, String code, String name_country) {
        this.id = id;
        this.code = code;
        this.name_country = name_country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName_country() {
        return name_country;
    }

    public void setName_country(String name_country) {
        this.name_country = name_country;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name_country='" + name_country + '\'' +
                '}';
    }
}
