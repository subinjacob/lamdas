package enumref;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SpecialityCodeProcessor {
    private final  Map<String,SpecialityCodes> map = new HashMap<>();
    public static void main(String args[]){
        List<SpecialityCodeVO> specialityCodeVOList = new ArrayList<>();
        SpecialityCodeVO sp1 = new SpecialityCodeVO();
        sp1.setCode("530");
        specialityCodeVOList.add(sp1);
        SpecialityCodeVO sp2 = new SpecialityCodeVO();
        sp2.setCode("540");
        specialityCodeVOList.add(sp2);
        SpecialityCodeProcessor specialityCodeProcessor = new SpecialityCodeProcessor();
        List<SpecialityCodeVO> validatedSpecialityCodeVOList =specialityCodeVOList.stream().map(specialityCodeProcessor::validate).collect(Collectors.toList());


    }

    public SpecialityCodeVO validate(SpecialityCodeVO specialityCodeVO){


        map.put("540",SpecialityCodes.GPAHPRA_540);
        map.put("530",SpecialityCodes.DOHAHPRA_530);

        System.out.println("Keys are"+map.keySet());
        SpecialityValidator specialityValidator = new SpecialityValidator();
        specialityValidator.validate(map.get(specialityCodeVO.getCode()),specialityCodeVO);

        return specialityCodeVO;
    }
}
