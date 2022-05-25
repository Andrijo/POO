package EVA3_11_THROW;

/**
 *
 * @author Andrijo
 */
public class EVA3_11_THROW {

    public static void main(String[] args) {
        try {
            // TODO code application logic here
            throw new Exception("Momentini");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
