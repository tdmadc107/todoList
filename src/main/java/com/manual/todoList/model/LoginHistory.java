package com.manual.todolist.model;

import java.util.Date;

public class LoginHistory extends LoginHistoryKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column login_history.role
     *
     * @mbg.generated
     */
    private String role;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column login_history.create_datetime
     *
     * @mbg.generated
     */
    private Date createDatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column login_history.create_by
     *
     * @mbg.generated
     */
    private String createBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column login_history.create_by_module
     *
     * @mbg.generated
     */
    private String createByModule;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column login_history.update_datetime
     *
     * @mbg.generated
     */
    private Date updateDatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column login_history.update_by
     *
     * @mbg.generated
     */
    private String updateBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column login_history.update_by_module
     *
     * @mbg.generated
     */
    private String updateByModule;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column login_history.role
     *
     * @return the value of login_history.role
     *
     * @mbg.generated
     */
    public String getRole() {
        return role;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column login_history.role
     *
     * @param role the value for login_history.role
     *
     * @mbg.generated
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column login_history.create_datetime
     *
     * @return the value of login_history.create_datetime
     *
     * @mbg.generated
     */
    public Date getCreateDatetime() {
        return createDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column login_history.create_datetime
     *
     * @param createDatetime the value for login_history.create_datetime
     *
     * @mbg.generated
     */
    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column login_history.create_by
     *
     * @return the value of login_history.create_by
     *
     * @mbg.generated
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column login_history.create_by
     *
     * @param createBy the value for login_history.create_by
     *
     * @mbg.generated
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column login_history.create_by_module
     *
     * @return the value of login_history.create_by_module
     *
     * @mbg.generated
     */
    public String getCreateByModule() {
        return createByModule;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column login_history.create_by_module
     *
     * @param createByModule the value for login_history.create_by_module
     *
     * @mbg.generated
     */
    public void setCreateByModule(String createByModule) {
        this.createByModule = createByModule;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column login_history.update_datetime
     *
     * @return the value of login_history.update_datetime
     *
     * @mbg.generated
     */
    public Date getUpdateDatetime() {
        return updateDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column login_history.update_datetime
     *
     * @param updateDatetime the value for login_history.update_datetime
     *
     * @mbg.generated
     */
    public void setUpdateDatetime(Date updateDatetime) {
        this.updateDatetime = updateDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column login_history.update_by
     *
     * @return the value of login_history.update_by
     *
     * @mbg.generated
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column login_history.update_by
     *
     * @param updateBy the value for login_history.update_by
     *
     * @mbg.generated
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column login_history.update_by_module
     *
     * @return the value of login_history.update_by_module
     *
     * @mbg.generated
     */
    public String getUpdateByModule() {
        return updateByModule;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column login_history.update_by_module
     *
     * @param updateByModule the value for login_history.update_by_module
     *
     * @mbg.generated
     */
    public void setUpdateByModule(String updateByModule) {
        this.updateByModule = updateByModule;
    }
}