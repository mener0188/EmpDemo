package com.bw.entity;

import java.io.Serializable;

public class Depart implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column depart.departid
     *
     * @mbg.generated Thu Nov 07 09:31:30 CST 2019
     */
    private Integer departid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column depart.departname
     *
     * @mbg.generated Thu Nov 07 09:31:30 CST 2019
     */
    private String departname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table depart
     *
     * @mbg.generated Thu Nov 07 09:31:30 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column depart.departid
     *
     * @return the value of depart.departid
     *
     * @mbg.generated Thu Nov 07 09:31:30 CST 2019
     */
    public Integer getDepartid() {
        return departid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column depart.departid
     *
     * @param departid the value for depart.departid
     *
     * @mbg.generated Thu Nov 07 09:31:30 CST 2019
     */
    public void setDepartid(Integer departid) {
        this.departid = departid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column depart.departname
     *
     * @return the value of depart.departname
     *
     * @mbg.generated Thu Nov 07 09:31:30 CST 2019
     */
    public String getDepartname() {
        return departname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column depart.departname
     *
     * @param departname the value for depart.departname
     *
     * @mbg.generated Thu Nov 07 09:31:30 CST 2019
     */
    public void setDepartname(String departname) {
        this.departname = departname == null ? null : departname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table depart
     *
     * @mbg.generated Thu Nov 07 09:31:30 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", departid=").append(departid);
        sb.append(", departname=").append(departname);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}