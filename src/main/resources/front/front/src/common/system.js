export function isAuth(tableName, key) {
  let role = localStorage.getItem("UserTableName");
  let menus = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"appFrontIcon":"cuIcon-copy","buttons":["新增","查看","修改","删除"],"menu":"普通管理员","menuJump":"列表","tableName":"putongguanliyuan"}],"menu":"普通管理员管理"},{"child":[{"appFrontIcon":"cuIcon-vip","buttons":["新增","查看","修改","删除"],"menu":"汽车类别","menuJump":"列表","tableName":"qicheleibie"}],"menu":"汽车类别管理"},{"child":[{"appFrontIcon":"cuIcon-explore","buttons":["查看","修改","删除"],"menu":"汽车信息","menuJump":"列表","tableName":"qichexinxi"}],"menu":"汽车信息管理"},{"child":[{"appFrontIcon":"cuIcon-discover","buttons":["查看","删除"],"menu":"租车订单","menuJump":"列表","tableName":"zuchedingdan"}],"menu":"租车订单管理"},{"child":[{"appFrontIcon":"cuIcon-phone","buttons":["查看","删除"],"menu":"取消订单","menuJump":"列表","tableName":"quxiaodingdan"}],"menu":"取消订单管理"},{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["查看","删除"],"menu":"还车信息","menuJump":"列表","tableName":"haichexinxi"}],"menu":"还车信息管理"},{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["新增","查看","修改","删除"],"menu":"汽车资讯","menuJump":"列表","tableName":"qichezixun"}],"menu":"汽车资讯管理"},{"child":[{"appFrontIcon":"cuIcon-vipcard","buttons":["查看","修改","回复","删除"],"menu":"留言板管理","tableName":"messages"}],"menu":"留言板管理"},{"child":[{"appFrontIcon":"cuIcon-group","buttons":["查看","修改","删除"],"menu":"汽车论坛","tableName":"forum"}],"menu":"汽车论坛"},{"child":[{"appFrontIcon":"cuIcon-camera","buttons":["查看","修改"],"menu":"关于我们","tableName":"aboutus"},{"appFrontIcon":"cuIcon-phone","buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"appFrontIcon":"cuIcon-pic","buttons":["查看","修改"],"menu":"系统简介","tableName":"systemintro"},{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"公告信息","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["查看","租赁汽车"],"menu":"汽车信息列表","menuJump":"列表","tableName":"qichexinxi"}],"menu":"汽车信息模块"},{"child":[{"appFrontIcon":"cuIcon-paint","buttons":["查看"],"menu":"汽车资讯列表","menuJump":"列表","tableName":"qichezixun"}],"menu":"汽车资讯模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-discover","buttons":["查看","删除","支付","归还汽车","取消订单"],"menu":"租车订单","menuJump":"列表","tableName":"zuchedingdan"}],"menu":"租车订单管理"},{"child":[{"appFrontIcon":"cuIcon-phone","buttons":["查看","删除"],"menu":"取消订单","menuJump":"列表","tableName":"quxiaodingdan"}],"menu":"取消订单管理"},{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["删除","查看"],"menu":"还车信息","menuJump":"列表","tableName":"haichexinxi"}],"menu":"还车信息管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["查看","租赁汽车"],"menu":"汽车信息列表","menuJump":"列表","tableName":"qichexinxi"}],"menu":"汽车信息模块"},{"child":[{"appFrontIcon":"cuIcon-paint","buttons":["查看"],"menu":"汽车资讯列表","menuJump":"列表","tableName":"qichezixun"}],"menu":"汽车资讯模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-explore","buttons":["新增","查看","修改","删除"],"menu":"汽车信息","menuJump":"列表","tableName":"qichexinxi"}],"menu":"汽车信息管理"},{"child":[{"appFrontIcon":"cuIcon-discover","buttons":["查看","删除","审核"],"menu":"租车订单","menuJump":"列表","tableName":"zuchedingdan"}],"menu":"租车订单管理"},{"child":[{"appFrontIcon":"cuIcon-phone","buttons":["查看","删除","审核","支付"],"menu":"取消订单","menuJump":"列表","tableName":"quxiaodingdan"}],"menu":"取消订单管理"},{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["查看","删除","审核"],"menu":"还车信息","menuJump":"列表","tableName":"haichexinxi"}],"menu":"还车信息管理"},{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["新增","查看","修改","删除"],"menu":"汽车资讯","menuJump":"列表","tableName":"qichezixun"}],"menu":"汽车资讯管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["查看","租赁汽车"],"menu":"汽车信息列表","menuJump":"列表","tableName":"qichexinxi"}],"menu":"汽车信息模块"},{"child":[{"appFrontIcon":"cuIcon-paint","buttons":["查看"],"menu":"汽车资讯列表","menuJump":"列表","tableName":"qichezixun"}],"menu":"汽车资讯模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"普通管理员","tableName":"putongguanliyuan"}];
  for(let i=0;i<menus.length;i++){
    if(menus[i].tableName==role){
      for(let j=0;j<menus[i].frontMenu.length;j++){
          for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
            if(tableName==menus[i].frontMenu[j].child[k].tableName){
              let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
              return buttons.indexOf(key) !== -1 || false
            }
          }
      }
    }
  }
  return false;
}

/**
 *  * 获取当前时间（yyyy-MM-dd hh:mm:ss）
 *   */
export function getCurDateTime() {
    let currentTime = new Date(),
    year = currentTime.getFullYear(),
    month = currentTime.getMonth() + 1 < 10 ? '0' + (currentTime.getMonth() + 1) : currentTime.getMonth() + 1,
    day = currentTime.getDate() < 10 ? '0' + currentTime.getDate() : currentTime.getDate(),
    hour = currentTime.getHours(),
    minute = currentTime.getMinutes(),
    second = currentTime.getSeconds();
    return year + "-" + month + "-" + day + " " +hour +":" +minute+":"+second;
}

/**
 *  * 获取当前日期（yyyy-MM-dd）
 *   */
export function getCurDate() {
    let currentTime = new Date(),
    year = currentTime.getFullYear(),
    month = currentTime.getMonth() + 1 < 10 ? '0' + (currentTime.getMonth() + 1) : currentTime.getMonth() + 1,
    day = currentTime.getDate() < 10 ? '0' + currentTime.getDate() : currentTime.getDate();
    return year + "-" + month + "-" + day;
}
