package io.swagger.model.DTO;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.*;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Objects;


@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-06-17T13:48:13.918Z[GMT]")
public class AccountDTO
{
    @JsonProperty("absoluteLimit")
    private BigDecimal absoluteLimit = null;
    @JsonProperty("dailyLimit")
    private BigDecimal dailyLimit = null;
    @OneToOne
    @JsonProperty("balance")
    private Balance balance = null;
    @JsonProperty("dateOfOpening")
    private String dateOfOpening = null;
    @JsonProperty("accountType")
    private Account.AccountTypeEnum accountType = null;
    @JsonProperty("accountStatus")
    private AccountStatusEnum accountStatus = null;
    @JsonProperty("user")
    @OneToOne
    private User user = null;



    public AccountDTO absoluteLimit(BigDecimal absoluteLimit)
    {
        this.absoluteLimit = absoluteLimit;
        return this;
    }

    /**
     * Get absoluteLimit
     *
     * @return absoluteLimit
     **/
    @Schema(example = "10.5", required = true, description = "")
    @NotNull

    @Valid
    public BigDecimal getAbsoluteLimit()
    {
        return absoluteLimit;
    }

    public void setAbsoluteLimit(BigDecimal absoluteLimit)
    {
        this.absoluteLimit = absoluteLimit;
    }

    public AccountDTO dailyLimit(BigDecimal dailyLimit)
    {
        this.dailyLimit = dailyLimit;
        return this;
    }

    /**
     * Get dailyLimit
     *
     * @return dailyLimit
     **/
    @Schema(example = "10.5", description = "")

    @Valid
    public BigDecimal getDailyLimit()
    {
        return dailyLimit;
    }

    public void setDailyLimit(BigDecimal dailyLimit)
    {
        this.dailyLimit = dailyLimit;
    }


    public AccountDTO balance(Balance balance)
    {
        this.balance = balance;
        return this;
    }

    /**
     * Get balance
     *
     * @return balance
     **/
    @Schema(required = true, description = "")
    @NotNull

    @Valid
    public Balance getBalance()
    {
        return balance;
    }

    public void setBalance(Balance balance)
    {
        this.balance = balance;
    }

    public AccountDTO dateOfOpening(String dateOfOpening)
    {
        this.dateOfOpening = dateOfOpening;
        return this;
    }

    /**
     * Get dateOfOpening
     *
     * @return dateOfOpening
     **/
    @Schema(example = "05-05-2020", required = true, description = "")
    @NotNull

    public String getDateOfOpening()
    {
        return dateOfOpening;
    }

    public void setDateOfOpening(String dateOfOpening)
    {
        this.dateOfOpening = dateOfOpening;
    }

    public AccountDTO accountType(Account.AccountTypeEnum accountType)
    {
        this.accountType = accountType;
        return this;
    }

    /**
     * Get accountType
     *
     * @return accountType
     **/
    @Schema(required = true, description = "")
    @NotNull

    public Account.AccountTypeEnum getAccountType()
    {
        return accountType;
    }

    public void setAccountType(Account.AccountTypeEnum accountType)
    {
        this.accountType = accountType;
    }

    public AccountDTO accountStatus(AccountStatusEnum accountStatus)
    {
        this.accountStatus = accountStatus;
        return this;
    }

    /**
     * Get accountStatus
     *
     * @return accountStatus
     **/
    @Schema(description = "")

    public AccountStatusEnum getAccountStatus()
    {
        return accountStatus;
    }

    public void setAccountStatus(AccountStatusEnum accountStatus)
    {
        this.accountStatus = accountStatus;
    }

    public AccountDTO user(User user)
    {
        this.user = user;
        return this;
    }

    /**
     * Get user
     *
     * @return user
     **/
    @Schema(required = true, description = "")
    @NotNull

    @Valid
    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }

    @Override
    public boolean equals(java.lang.Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        AccountDTO account = (AccountDTO) o;
        return /*Objects.equals(this.IBAN, account.IBAN) &&*/
                Objects.equals(this.absoluteLimit, account.absoluteLimit) &&
                Objects.equals(this.dailyLimit, account.dailyLimit) &&
                Objects.equals(this.balance, account.balance) &&
                Objects.equals(this.dateOfOpening, account.dateOfOpening) &&
                Objects.equals(this.accountType, account.accountType) &&
                Objects.equals(this.accountStatus, account.accountStatus) &&
                Objects.equals(this.user, account.user);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(absoluteLimit, dailyLimit, balance, dateOfOpening, accountType, accountStatus, user);
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("class Account {\n");

//        sb.append("    IBAN: ").append(toIndentedString(IBAN)).append("\n");
        sb.append("    absoluteLimit: ").append(toIndentedString(absoluteLimit)).append("\n");
        sb.append("    dailyLimit: ").append(toIndentedString(dailyLimit)).append("\n");
        sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
        sb.append("    dateOfOpening: ").append(toIndentedString(dateOfOpening)).append("\n");
        sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
        sb.append("    accountStatus: ").append(toIndentedString(accountStatus)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o)
    {
        if (o == null)
        {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    /**
     * Gets or Sets accountType
     */


    /**
     * Gets or Sets accountStatus
     */

}
