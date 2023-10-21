package trainingMO.day5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;
public class NestedList {
	public static void main(String[] args) {
		List<String> India=new ArrayList<String>();
		India.add("Pandya");
		India.add("bumra");
		India.add("Shami");
		India.add("SKY");
		
		List<String> aus=Arrays.asList("stoinis", "Warner","Marsh");
		List<String> NZ=Arrays.asList("santner", "Glenn","Latham");
		
		List<List<String>> worldcup= new ArrayList<List<String>>();
		worldcup.add(India);
		worldcup.add(aus);
		worldcup.add(NZ);
System.out.println(worldcup);
	}

}
