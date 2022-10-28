package mao.dozer_demo.entity;

/**
 * Project name(项目名称)：dozer_demo
 * Package(包名): mao.dozer_demo.entity
 * Class(类名): UserDTO
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/10/28
 * Time(创建时间)： 19:39
 * Version(版本): 1.0
 * Description(描述)： 无
 */


public class UserDTO
{
    /**
     * 用户id
     */
    private String userId;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 用户年龄
     */
    private int userAge;
    /**
     * 地址
     */
    private String address;
    /**
     * 生日
     */
    private String birthday;

    /**
     * Instantiates a new User dto.
     */
    public UserDTO()
    {
    }

    /**
     * Instantiates a new User dto.
     *
     * @param userId   the user id
     * @param userName the user name
     * @param userAge  the user age
     * @param address  the address
     * @param birthday the birthday
     */
    public UserDTO(String userId, String userName, int userAge, String address, String birthday)
    {
        this.userId = userId;
        this.userName = userName;
        this.userAge = userAge;
        this.address = address;
        this.birthday = birthday;
    }

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId()
    {
        return userId;
    }

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId)
    {
        this.userId = userId;
    }

    /**
     * Gets user name.
     *
     * @return the user name
     */
    public String getUserName()
    {
        return userName;
    }

    /**
     * Sets user name.
     *
     * @param userName the user name
     */
    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    /**
     * Gets user age.
     *
     * @return the user age
     */
    public int getUserAge()
    {
        return userAge;
    }

    /**
     * Sets user age.
     *
     * @param userAge the user age
     */
    public void setUserAge(int userAge)
    {
        this.userAge = userAge;
    }

    /**
     * Gets address.
     *
     * @return the address
     */
    public String getAddress()
    {
        return address;
    }

    /**
     * Sets address.
     *
     * @param address the address
     */
    public void setAddress(String address)
    {
        this.address = address;
    }

    /**
     * Gets birthday.
     *
     * @return the birthday
     */
    public String getBirthday()
    {
        return birthday;
    }

    /**
     * Sets birthday.
     *
     * @param birthday the birthday
     */
    public void setBirthday(String birthday)
    {
        this.birthday = birthday;
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("userId：").append(userId).append('\n');
        stringbuilder.append("userName：").append(userName).append('\n');
        stringbuilder.append("userAge：").append(userAge).append('\n');
        stringbuilder.append("address：").append(address).append('\n');
        stringbuilder.append("birthday：").append(birthday).append('\n');
        return stringbuilder.toString();
    }
}
