package com.chad.library.adapter.base.entity.node

import java.util.concurrent.CopyOnWriteArrayList

abstract class BaseNode {

    /**
     * 获取子节点。如果没有子节点，返回 空数组
     */
    var childNode = CopyOnWriteArrayList<BaseNode>()

}