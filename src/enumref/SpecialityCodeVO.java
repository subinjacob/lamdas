package enumref;

import java.util.Date;

public class SpecialityCodeVO {

    private String code;
    private Date startDate;

    public SpecialityCodeVO() {
    }

    public SpecialityCodeVO(String code, Date startDate) {
        this.code = code;
        this.startDate = startDate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
}
