package pl.patryk.pizza.remote.rest.dto.request;

import pl.patryk.pizza.domain.model.SizeType;

import java.math.BigDecimal;

public class addSizeDto {
    private SizeType size;
    private BigDecimal price;

    public addSizeDto() {
    }

    public addSizeDto(SizeType size, BigDecimal price) {
        this.size = size;
        this.price = price;
    }

    public SizeType getSize() {
        return size;
    }

    public void setSize(SizeType size) {
        this.size = size;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

}
