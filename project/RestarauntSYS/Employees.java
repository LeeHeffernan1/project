package RestarauntSYS;

public class Employees {

    private String name;
    private String position;
    private String address;
    private String pps;
    private String dob;
    private String gender;

    public Employees() {
        this("Empty","Empty","Empty","Empty","Empty","Empty");
    }

    public Employees(String name,String position,String address, String pps, String date, String gender ){
        setName(name);
        setPosition(position);
        setAddress(address);
        setPps(pps);
        setDate(date);
        setGender(gender);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPps(String pps) {
        this.pps = pps;
    }

    public void setDate(String date) {
        this.dob = date;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getAddress() {
        return address;
    }

    public String getPps() {
        return pps;
    }

    public String getDate() {
        return dob;
    }

    public String getGender() {
        return gender;
    }

    public String toString(){
        return "Name:  " + getName() + "        Position:  "+ getPosition()+ "      Address:  "+ getAddress() + "       pps:  "+ getPps() + "       Date:  "+ getDate()
                + "     Gender:  " + getGender();
    }

    public boolean size() {
        return size();
    }
}

