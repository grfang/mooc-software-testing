package tudelft.hwone;

public class GiaFang {
	public String getFullName() {
        return "Gia Fang";
    }

    public String getFirstName() {
        return "Gia";
    }

    public String getLastName() {
        return "Fang";
    }

    public String getUCInetID() {
        return "grfang";
    }

    public int getStudentNumber() {
        return 71049457;
    }

    public String getRotatedFullName(int shift) {
        String fullName = getFullName();
        int len = fullName.length();
        shift = shift % len; // handle wrap-around
        if (shift < 0) {
            shift += len; // ensure positive shift for right rotation
        }
        return fullName.substring(shift) + fullName.substring(0, shift);
    }
}
