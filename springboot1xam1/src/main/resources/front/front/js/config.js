
var projectName = '火车订票管理系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
]


var indexNav = [

{
	name: '车次信息',
	url: './pages/checixinxi/list.html'
}, 

{
	name: '火车资讯',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/springboot1xam1/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"车型信息","menuJump":"列表","tableName":"chexingxinxi"}],"menu":"车型信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"车次信息","menuJump":"列表","tableName":"checixinxi"}],"menu":"车次信息管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"购票订单","menuJump":"列表","tableName":"goupiaodingdan"}],"menu":"购票订单管理"},{"child":[{"buttons":["查看","修改","删除","审核"],"menu":"改签订单","menuJump":"列表","tableName":"gaiqiandingdan"}],"menu":"改签订单管理"},{"child":[{"buttons":["查看","修改","删除","审核"],"menu":"退票订单","menuJump":"列表","tableName":"tuipiaodingdan"}],"menu":"退票订单管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"火车资讯","tableName":"news"},{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看","购票","退票"],"menu":"车次信息列表","menuJump":"列表","tableName":"checixinxi"}],"menu":"车次信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","改签","支付"],"menu":"购票订单","menuJump":"列表","tableName":"goupiaodingdan"}],"menu":"购票订单管理"},{"child":[{"buttons":["查看"],"menu":"改签订单","menuJump":"列表","tableName":"gaiqiandingdan"}],"menu":"改签订单管理"},{"child":[{"buttons":["查看"],"menu":"退票订单","menuJump":"列表","tableName":"tuipiaodingdan"}],"menu":"退票订单管理"}],"frontMenu":[{"child":[{"buttons":["查看","购票","退票"],"menu":"车次信息列表","menuJump":"列表","tableName":"checixinxi"}],"menu":"车次信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
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
