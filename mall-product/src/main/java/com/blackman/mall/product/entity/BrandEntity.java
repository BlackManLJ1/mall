package com.blackman.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

import com.blackman.common.validator.ListValue;
import com.blackman.common.validator.group.AddGroup;
import com.blackman.common.validator.group.UpdateGroup;
import com.blackman.common.validator.group.UpdateStatusGroup;
import lombok.Data;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.*;

/**
 * 品牌
 * 
 * @author BlackMan
 * @email lujun19950@gmail.com
 * @date 2023-02-17 17:34:53
 */
@Data
@TableName("pms_brand")
public class BrandEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 品牌id
	 */
	@Null(message = "品牌id必须为空", groups = AddGroup.class)
	@NotNull(message = "品牌id不能为空", groups = UpdateGroup.class)
	@TableId
	private Long brandId;
	/**
	 * 品牌名
	 */
	@NotBlank(message = "品牌名不能为空")
	private String name;
	/**
	 * 品牌logo地址
	 */
	@NotEmpty(message = "logo地址不能为空")
	@URL(message = "logo地址不正确")
	private String logo;
	/**
	 * 介绍
	 */
	private String descript;
	/**
	 * 显示状态[0-不显示；1-显示]
	 */
	@ListValue(values = {0, 1}, groups = UpdateStatusGroup.class)
	private Integer showStatus;
	/**
	 * 检索首字母
	 */
	@Pattern(regexp = "^[a-zA-Z]$", message = "检索首字母不正确")
	private String firstLetter;
	/**
	 * 排序
	 */
	@NotNull(message="排序不能为空")
	@Min(value = 0, message = "sort最小值为0")
	private Integer sort;

}
