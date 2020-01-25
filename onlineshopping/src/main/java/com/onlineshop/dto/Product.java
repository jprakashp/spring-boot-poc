package com.onlineshop.dto;



import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "prod_name")
	private String prodName;
	@Column(name = "prod_desc")
	private String prodDesc;
	@Column(name = "prod_type")
	private String prodType;
	@Column(name = "prod_price")
	private float prodPrice;
	@Column(name = "prod_qty")
	private int prodQty;
	@Column(name = "created_by")
	private String createdBy;
	@Column(name = "prod_regd_dt")
	private Date prodRegdDate;
	@Column(name = "prod_mfg")
	private Date prodMfgDate;
	@Column(name = "prod_exp")
	private Date prodExpDate;
	
	public Product() {
	}

	public Product(String prodName, String prodDesc, String prodType, float prodPrice, int prodQty, String createdBy,
			Date prodRegdDate, Date prodMfgDate, Date prodExpDate) {
		super();
		this.prodName = prodName;
		this.prodDesc = prodDesc;
		this.prodType = prodType;
		this.prodPrice = prodPrice;
		this.prodQty = prodQty;
		this.createdBy = createdBy;
		this.prodRegdDate = prodRegdDate;
		this.prodMfgDate = prodMfgDate;
		this.prodExpDate = prodExpDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdDesc() {
		return prodDesc;
	}

	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}

	public String getProdType() {
		return prodType;
	}

	public void setProdType(String prodType) {
		this.prodType = prodType;
	}

	public float getProdPrice() {
		return prodPrice;
	}

	public void setProdPrice(float prodPrice) {
		this.prodPrice = prodPrice;
	}

	public int getProdQty() {
		return prodQty;
	}

	public void setProdQty(int prodQty) {
		this.prodQty = prodQty;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getProdRegdDate() {
		return prodRegdDate;
	}

	public void setProdRegdDate(Date prodRegdDate) {
		this.prodRegdDate = prodRegdDate;
	}

	public Date getProdMfgDate() {
		return prodMfgDate;
	}

	public void setProdMfgDate(Date prodMfgDate) {
		this.prodMfgDate = prodMfgDate;
	}

	public Date getProdExpDate() {
		return prodExpDate;
	}

	public void setProdExpDate(Date prodExpDate) {
		this.prodExpDate = prodExpDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createdBy == null) ? 0 : createdBy.hashCode());
		result = prime * result + ((prodDesc == null) ? 0 : prodDesc.hashCode());
		result = prime * result + ((prodExpDate == null) ? 0 : prodExpDate.hashCode());
		result = prime * result + ((prodMfgDate == null) ? 0 : prodMfgDate.hashCode());
		result = prime * result + ((prodName == null) ? 0 : prodName.hashCode());
		result = prime * result + Float.floatToIntBits(prodPrice);
		result = prime * result + prodQty;
		result = prime * result + ((prodRegdDate == null) ? 0 : prodRegdDate.hashCode());
		result = prime * result + ((prodType == null) ? 0 : prodType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (createdBy == null) {
			if (other.createdBy != null)
				return false;
		} else if (!createdBy.equals(other.createdBy))
			return false;
		if (prodDesc == null) {
			if (other.prodDesc != null)
				return false;
		} else if (!prodDesc.equals(other.prodDesc))
			return false;
		if (prodExpDate == null) {
			if (other.prodExpDate != null)
				return false;
		} else if (!prodExpDate.equals(other.prodExpDate))
			return false;
		if (prodMfgDate == null) {
			if (other.prodMfgDate != null)
				return false;
		} else if (!prodMfgDate.equals(other.prodMfgDate))
			return false;
		if (prodName == null) {
			if (other.prodName != null)
				return false;
		} else if (!prodName.equals(other.prodName))
			return false;
		if (Float.floatToIntBits(prodPrice) != Float.floatToIntBits(other.prodPrice))
			return false;
		if (prodQty != other.prodQty)
			return false;
		if (prodRegdDate == null) {
			if (other.prodRegdDate != null)
				return false;
		} else if (!prodRegdDate.equals(other.prodRegdDate))
			return false;
		if (prodType == null) {
			if (other.prodType != null)
				return false;
		} else if (!prodType.equals(other.prodType))
			return false;
		return true;
	}
	
	
}
