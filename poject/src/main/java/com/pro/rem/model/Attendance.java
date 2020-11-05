package com.pro.rem.model;

/**
 * 统计本月考勤
 */
public class Attendance {
    private Integer aid;

    private Integer fid;//员工id

    private Integer late;//迟到次数

    private Integer leave;//早退次数

    private Integer absenteeism;//旷工次数

    private Integer attendance;//实际出勤天数

    private Integer attmonth;//统计的月份，例如：1月

    private String aremark;//预留字段

    public Attendance(Integer aid, Integer fid, Integer late, Integer leave, Integer absenteeism, Integer attendance, Integer attmonth, String aremark) {
        this.aid = aid;
        this.fid = fid;
        this.late = late;
        this.leave = leave;
        this.absenteeism = absenteeism;
        this.attendance = attendance;
        this.attmonth = attmonth;
        this.aremark = aremark;
    }

    public Attendance() {
        super();
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getLate() {
        return late;
    }

    public void setLate(Integer late) {
        this.late = late;
    }

    public Integer getLeave() {
        return leave;
    }

    public void setLeave(Integer leave) {
        this.leave = leave;
    }

    public Integer getAbsenteeism() {
        return absenteeism;
    }

    public void setAbsenteeism(Integer absenteeism) {
        this.absenteeism = absenteeism;
    }

    public Integer getAttendance() {
        return attendance;
    }

    public void setAttendance(Integer attendance) {
        this.attendance = attendance;
    }

    public Integer getAttmonth() {
        return attmonth;
    }

    public void setAttmonth(Integer attmonth) {
        this.attmonth = attmonth;
    }

    public String getAremark() {
        return aremark;
    }

    public void setAremark(String aremark) {
        this.aremark = aremark;
    }
}