import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ToXml {

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
        FileOutputStream toXml = null;
        try {
            toXml = new FileOutputStream("C:\\Users\\Вова\\Practice10\\ToXml");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        java.beans.XMLEncoder xmlEncoder = new java.beans.XMLEncoder(toXml);
        xmlEncoder.writeObject(list);
        xmlEncoder.close();
    }
}
