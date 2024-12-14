package com.chikuwa_latte.core.entity.db_transaction;

import java.io.Serializable;
import java.time.LocalDateTime;

public class TransactionFlywaySchemaHistory implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transaction_flyway_schema_history.installed_rank
     *
     * @mbg.generated
     */
    private Integer installedRank;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transaction_flyway_schema_history.version
     *
     * @mbg.generated
     */
    private String version;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transaction_flyway_schema_history.description
     *
     * @mbg.generated
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transaction_flyway_schema_history.type
     *
     * @mbg.generated
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transaction_flyway_schema_history.script
     *
     * @mbg.generated
     */
    private String script;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transaction_flyway_schema_history.checksum
     *
     * @mbg.generated
     */
    private Integer checksum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transaction_flyway_schema_history.installed_by
     *
     * @mbg.generated
     */
    private String installedBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transaction_flyway_schema_history.installed_on
     *
     * @mbg.generated
     */
    private LocalDateTime installedOn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transaction_flyway_schema_history.execution_time
     *
     * @mbg.generated
     */
    private Integer executionTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transaction_flyway_schema_history.success
     *
     * @mbg.generated
     */
    private Boolean success;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table transaction_flyway_schema_history
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transaction_flyway_schema_history
     *
     * @mbg.generated
     */
    public TransactionFlywaySchemaHistory(Integer installedRank, String version, String description, String type, String script, Integer checksum, String installedBy, LocalDateTime installedOn, Integer executionTime, Boolean success) {
        this.installedRank = installedRank;
        this.version = version;
        this.description = description;
        this.type = type;
        this.script = script;
        this.checksum = checksum;
        this.installedBy = installedBy;
        this.installedOn = installedOn;
        this.executionTime = executionTime;
        this.success = success;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transaction_flyway_schema_history
     *
     * @mbg.generated
     */
    public TransactionFlywaySchemaHistory() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction_flyway_schema_history.installed_rank
     *
     * @return the value of transaction_flyway_schema_history.installed_rank
     *
     * @mbg.generated
     */
    public Integer getInstalledRank() {
        return installedRank;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction_flyway_schema_history.installed_rank
     *
     * @param installedRank the value for transaction_flyway_schema_history.installed_rank
     *
     * @mbg.generated
     */
    public void setInstalledRank(Integer installedRank) {
        this.installedRank = installedRank;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction_flyway_schema_history.version
     *
     * @return the value of transaction_flyway_schema_history.version
     *
     * @mbg.generated
     */
    public String getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction_flyway_schema_history.version
     *
     * @param version the value for transaction_flyway_schema_history.version
     *
     * @mbg.generated
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction_flyway_schema_history.description
     *
     * @return the value of transaction_flyway_schema_history.description
     *
     * @mbg.generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction_flyway_schema_history.description
     *
     * @param description the value for transaction_flyway_schema_history.description
     *
     * @mbg.generated
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction_flyway_schema_history.type
     *
     * @return the value of transaction_flyway_schema_history.type
     *
     * @mbg.generated
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction_flyway_schema_history.type
     *
     * @param type the value for transaction_flyway_schema_history.type
     *
     * @mbg.generated
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction_flyway_schema_history.script
     *
     * @return the value of transaction_flyway_schema_history.script
     *
     * @mbg.generated
     */
    public String getScript() {
        return script;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction_flyway_schema_history.script
     *
     * @param script the value for transaction_flyway_schema_history.script
     *
     * @mbg.generated
     */
    public void setScript(String script) {
        this.script = script;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction_flyway_schema_history.checksum
     *
     * @return the value of transaction_flyway_schema_history.checksum
     *
     * @mbg.generated
     */
    public Integer getChecksum() {
        return checksum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction_flyway_schema_history.checksum
     *
     * @param checksum the value for transaction_flyway_schema_history.checksum
     *
     * @mbg.generated
     */
    public void setChecksum(Integer checksum) {
        this.checksum = checksum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction_flyway_schema_history.installed_by
     *
     * @return the value of transaction_flyway_schema_history.installed_by
     *
     * @mbg.generated
     */
    public String getInstalledBy() {
        return installedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction_flyway_schema_history.installed_by
     *
     * @param installedBy the value for transaction_flyway_schema_history.installed_by
     *
     * @mbg.generated
     */
    public void setInstalledBy(String installedBy) {
        this.installedBy = installedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction_flyway_schema_history.installed_on
     *
     * @return the value of transaction_flyway_schema_history.installed_on
     *
     * @mbg.generated
     */
    public LocalDateTime getInstalledOn() {
        return installedOn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction_flyway_schema_history.installed_on
     *
     * @param installedOn the value for transaction_flyway_schema_history.installed_on
     *
     * @mbg.generated
     */
    public void setInstalledOn(LocalDateTime installedOn) {
        this.installedOn = installedOn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction_flyway_schema_history.execution_time
     *
     * @return the value of transaction_flyway_schema_history.execution_time
     *
     * @mbg.generated
     */
    public Integer getExecutionTime() {
        return executionTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction_flyway_schema_history.execution_time
     *
     * @param executionTime the value for transaction_flyway_schema_history.execution_time
     *
     * @mbg.generated
     */
    public void setExecutionTime(Integer executionTime) {
        this.executionTime = executionTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction_flyway_schema_history.success
     *
     * @return the value of transaction_flyway_schema_history.success
     *
     * @mbg.generated
     */
    public Boolean getSuccess() {
        return success;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction_flyway_schema_history.success
     *
     * @param success the value for transaction_flyway_schema_history.success
     *
     * @mbg.generated
     */
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transaction_flyway_schema_history
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TransactionFlywaySchemaHistory other = (TransactionFlywaySchemaHistory) that;
        return (this.getInstalledRank() == null ? other.getInstalledRank() == null : this.getInstalledRank().equals(other.getInstalledRank()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getScript() == null ? other.getScript() == null : this.getScript().equals(other.getScript()))
            && (this.getChecksum() == null ? other.getChecksum() == null : this.getChecksum().equals(other.getChecksum()))
            && (this.getInstalledBy() == null ? other.getInstalledBy() == null : this.getInstalledBy().equals(other.getInstalledBy()))
            && (this.getInstalledOn() == null ? other.getInstalledOn() == null : this.getInstalledOn().equals(other.getInstalledOn()))
            && (this.getExecutionTime() == null ? other.getExecutionTime() == null : this.getExecutionTime().equals(other.getExecutionTime()))
            && (this.getSuccess() == null ? other.getSuccess() == null : this.getSuccess().equals(other.getSuccess()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transaction_flyway_schema_history
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getInstalledRank() == null) ? 0 : getInstalledRank().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getScript() == null) ? 0 : getScript().hashCode());
        result = prime * result + ((getChecksum() == null) ? 0 : getChecksum().hashCode());
        result = prime * result + ((getInstalledBy() == null) ? 0 : getInstalledBy().hashCode());
        result = prime * result + ((getInstalledOn() == null) ? 0 : getInstalledOn().hashCode());
        result = prime * result + ((getExecutionTime() == null) ? 0 : getExecutionTime().hashCode());
        result = prime * result + ((getSuccess() == null) ? 0 : getSuccess().hashCode());
        return result;
    }
}