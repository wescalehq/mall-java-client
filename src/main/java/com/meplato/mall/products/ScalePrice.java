/*
 * Copyright (c) 2015 Meplato GmbH, Switzerland.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.meplato.mall.products;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

/**
 * ScalePrice describes a price that is dependent on the ordered quantity.
 */
public class ScalePrice {
	@SerializedName("lbound")
	private double lbound;
	@SerializedName("price")
	private double price;

	/**
	 * Create new instance of ScalePrice.
	 */
	public ScalePrice() {
	}

	/**
	 * LBound is the lower bound when this price will become effective.
	 */
	public double getLbound() {
		return this.lbound;
	}

	/**
	 * LBound is the lower bound when this price will become effective.
	 */
	public void setLbound(double lbound) {
		this.lbound = lbound;
	}

	/**
	 * Price is the net price for the given lower bound.
	 */
	public double getPrice() {
		return this.price;
	}

	/**
	 * Price is the net price for the given lower bound.
	 */
	public void setPrice(double price) {
		this.price = price;
	}
}

