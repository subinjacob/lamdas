package enumref;

public class SpecialityValidator {


    public  SpecialityCodeVO dohAphraValidator( SpecialityCodeVO specialityCodeVO) {
        System.out.println("DOH Validator Proceesed");
        return specialityCodeVO;
    }

    public SpecialityCodeVO gpAphraValidator(
            SpecialityCodeVO specialityCodeVO) {
        System.out.println("GP Validator Proceesed");
        return specialityCodeVO;
    }
    public SpecialityCodeVO validate(SpecialityCodes specialityCodes,SpecialityCodeVO specialityCodeVO){
      return   specialityCodes.validateExec.apply(this,specialityCodeVO);
    }
}
