package com.starts.movieguide.adapter

import com.angcyo.dsladapter.DslAdapterItem
import com.angcyo.dsladapter.DslViewHolder
import com.starts.movieguide.R

/**

 *文件描述：.
 *作者：Created by Administrator on 2020/9/18.
 *版本号：1.0

 */
class DiscoverAdAdapterItem :  DslAdapterItem(){
    override fun onItemBind(
        itemHolder: DslViewHolder,
        itemPosition: Int,
        adapterItem: DslAdapterItem,
        payloads: List<Any>
    ) {
        super.onItemBind(itemHolder, itemPosition, adapterItem, payloads)
    }

    override var itemLayoutId: Int
        get() = super.itemLayoutId
        set(value) {
            R.layout.item_discover_ad
        }
}