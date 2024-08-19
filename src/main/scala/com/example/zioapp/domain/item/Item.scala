package com.example.zioapp
package domain
package item

import common.Money

final case class Item(id: ItemId, name: String, price: Money, productType: ProductType)
