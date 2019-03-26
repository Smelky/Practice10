import java.beans.XMLEncoder;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

public class ToXml {

    private static final Logger log = Logger.getLogger(ValidateMachine.class.getName());


    public void createMultiballStructure() {
        List<Map<List<Set<Integer>>, String>> list = new ArrayList<Map<List<Set<Integer>>, String>>();
        int decimalInHashSet = 6;
        Set hashSetInList = new HashSet();
        hashSetInList.add(decimalInHashSet);
        List listInHashMap = new ArrayList();
        listInHashMap.add(hashSetInList);
        Map hashMapInList = new HashMap();
        hashMapInList.put(listInHashMap, "Six");
        list.add(hashMapInList);

        writeToXml(list);
    }

    private void writeToXml(List list) {
        try (FileOutputStream toXml = new FileOutputStream("ToXml")) {
            XMLEncoder xmlEncoder = new XMLEncoder(toXml);
            xmlEncoder.writeObject(list);
            xmlEncoder.close();
        } catch (Exception e) {
            log.info(e.getMessage());
        }
    }
}
