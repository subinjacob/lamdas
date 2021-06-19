package methedref;

import java.util.function.Function;

public class MainProcessor {


    public void mainProcessor(Function<SpecCode,String> codeprocessor,SpecCode s){

      System.out.println(codeprocessor.apply(s));

    }

    public static void main(String[] ars){
        MainProcessor mainProcessor =new MainProcessor();
        EmployProcessor employProcessor=new EmployProcessor();
        StudentProcessor studentProcessor= new StudentProcessor();
        SpecCode s = new SpecCode();
        s.setCode("10");
        s.setTypecode(110);
       mainProcessor.mainProcessor(employProcessor::process,s);
        mainProcessor.mainProcessor(studentProcessor::process,s);
        mainProcessor.mainProcessor(employProcessor::unknownProceesor,s);
    }


}
