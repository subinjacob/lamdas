package enumref;

import java.util.function.BiFunction;

public enum SpecialityCodes {
    DOHAHPRA_530(SpecialityValidator::dohAphraValidator),
    GPAHPRA_540(SpecialityValidator::gpAphraValidator);

    public final BiFunction<SpecialityValidator,SpecialityCodeVO,SpecialityCodeVO> validateExec;

    private SpecialityCodes(BiFunction<SpecialityValidator,SpecialityCodeVO,SpecialityCodeVO> validateExec){
        this.validateExec=validateExec;
    }
}
