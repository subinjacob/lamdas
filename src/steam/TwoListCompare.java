package steam;

import enumref.SpecialityCodeVO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class TwoListCompare {
public final List<SpecialityCodeVO> specialityCodeVOList1 ;
    public final   List<SpecialityCodeVO> specialityCodeVOList2 ;
    public TwoListCompare(List<SpecialityCodeVO> specialityCodeVOList1,List<SpecialityCodeVO> specialityCodeVOList2){

this.specialityCodeVOList1=specialityCodeVOList1;
        this.specialityCodeVOList2=specialityCodeVOList2;
    };



    public static void main(String[] arg){

        List<SpecialityCodeVO> specialityCodeVOList1 = new ArrayList<>();



        specialityCodeVOList1.add(new SpecialityCodeVO("540", new Date()));
        specialityCodeVOList1.add(new SpecialityCodeVO("550", new Date()));
        specialityCodeVOList1.add(new SpecialityCodeVO("56", new Date()));
        List<SpecialityCodeVO> specialityCodeVOList2 = new ArrayList<>();
        specialityCodeVOList2.add(new SpecialityCodeVO("540", new Date()));
        specialityCodeVOList2.add(new SpecialityCodeVO("570", new Date()));
        specialityCodeVOList2.add(new SpecialityCodeVO("56", new Date()));


        TwoListCompare twoListCompare = new TwoListCompare(specialityCodeVOList1,specialityCodeVOList2);

       List<String> list= specialityCodeVOList1.stream().map(s->s.getCode().toString()).collect(Collectors.toList());
        System.out.println("Contains:::::"+specialityCodeVOList2.stream().filter(l->list.contains(l.getCode())).findAny().isPresent());

    }
}
