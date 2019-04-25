package cn.cie.entity.dto;

import cn.cie.entity.Order;

import java.util.Date;
import java.util.List;

/**
 * Created by RojerAlone on 2017/6/12.
 */
public class OrderDTO {

    /**
     * 订单id
     */
    private Integer id;

    /**
     * 订单所属用户id
     */
    private Integer uid;

    /**
     * 订单的总价格
     */
    private Double total;

    /**
     * 订单创建时间
     */
    private Date ctime;

    /**
     * 订单更新时间
     */
    private Date utime;

    /**
     * 订单状态
     */
    private Byte stat;

    /**
     * 订单详细信息
     */
    private List<OrderItemDTO> orderitems;

    public OrderDTO(Order order, List<OrderItemDTO> orderitems) {
        this.id = order.getId();
        this.uid = order.getUid();
        this.total = order.getPrice();
        this.ctime = order.getCtime();
        this.utime = order.getUtime();
        this.stat = order.getStat();
        this.orderitems = orderitems;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public void setUtime(Date utime) {
        this.utime = utime;
    }

    public void setStat(Byte stat) {
        this.stat = stat;
    }

    public void setOrderitems(List<OrderItemDTO> orderitems) {
        this.orderitems = orderitems;
    }

    public Integer getId() {
        return id;
    }

    public Integer getUid() {
        return uid;
    }

    public Double getTotal() {
        return total;
    }

    public Date getCtime() {
        return ctime;
    }

    public Date getUtime() {
        return utime;
    }

    public Byte getStat() {
        return stat;
    }

    public List<OrderItemDTO> getOrderitems() {
        return orderitems;
    }
}
