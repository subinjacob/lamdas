package methodref;

public class EmployProcessor {

    public String process(SpecCode spe){
        return spe.getCode()+" From Employ Processor";
    }
    public String unknownProceesor(SpecCode sp){

        return "Unknown Processor";
    }
}
