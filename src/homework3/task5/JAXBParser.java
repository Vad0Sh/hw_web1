package homework3.task5;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.List;

public class JAXBParser {
    public static void main(String[] args) throws JAXBException {
        File file = new File("src/homework3/task5/Computer.xml");
        JAXBContext context = JAXBContext.newInstance(Devices.class);

        Unmarshaller unmarshaller = context.createUnmarshaller();
        Devices devices = (Devices) unmarshaller.unmarshal(file);
        System.out.println(devices.getId());
        List<Device> list = devices.getDevices();
        for (Device device:list)
            System.out.println(device.getName()+" "+device.getPrice()+" "+device.getOrigin()+" "+device.getType()+" "+device.getCritical() );
    }
}
