package tudelft.hwone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestGiaFang {
    
    @Test
    public void testGetFullName() {
        GiaFang giaFang = new GiaFang();
        Assertions.assertEquals("Gia Fang", giaFang.getFullName());
    }
    
    @Test
    public void testGetFirstName() {
        GiaFang giaFang = new GiaFang();
        Assertions.assertEquals("Gia", giaFang.getFirstName());
    }

    @Test
    public void testGetLastName() {
        GiaFang giaFang = new GiaFang();
        Assertions.assertEquals("Fang", giaFang.getLastName());
    }

    @Test
    public void testGetUCInetID() {
        GiaFang giaFang = new GiaFang();
        Assertions.assertEquals("grfang", giaFang.getUCInetID());
    }

    @Test
    public void testGetStudentNumber() {
        GiaFang giaFang = new GiaFang();
        Assertions.assertEquals(71049457, giaFang.getStudentNumber());
    }

    @Test
    public void testPositiveRotation() {
        GiaFang giaFang = new GiaFang();
        Assertions.assertEquals("a FangGi", giaFang.getRotatedFullName(2));
    }

    @Test
    public void testNegativeRotation() {
        GiaFang giaFang = new GiaFang();
        Assertions.assertEquals("angGia F", giaFang.getRotatedFullName(-3));
    }
}
