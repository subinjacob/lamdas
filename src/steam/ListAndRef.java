package steam;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import enumrefs.SpecialityCodeVO;

public class ListAndRef {


    public static void main(String[] arg){

        List<SpecialityCodeVO> specialityCodeVOList1 = new ArrayList<>();



        specialityCodeVOList1.add(new SpecialityCodeVO("540", new Date()));
        specialityCodeVOList1.add(new SpecialityCodeVO("550", new Date()));
        specialityCodeVOList1.add(new SpecialityCodeVO("56", new Date()));

        List<SpecialityCodeVO> specialityCodeVOList2=specialityCodeVOList1.stream().map(s->s).filter(s->"56".equals(s.getCode())).collect(Collectors.toList());

        System.out.println("Orginal List "+specialityCodeVOList1);
        System.out.println("Removed List "+specialityCodeVOList2);


    }
}
