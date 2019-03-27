import org.apache.log4j.Logger;

import java.beans.XMLEncoder;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ToXml {

    private static final Logger LOGGER = Logger.getLogger(ValidateMachine.class);

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
        try (FileOutputStream toXml = new FileOutputStream("src/main/resources/ToXml");
             XMLEncoder xmlEncoder = new XMLEncoder(toXml)) {
            xmlEncoder.writeObject(list);
        } catch (Exception e) {
            LOGGER.info(e.getMessage());
        }
    }
}
