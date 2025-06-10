import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import tuipiaodingdan from '@/views/modules/tuipiaodingdan/list'
    import checixinxi from '@/views/modules/checixinxi/list'
    import chexingxinxi from '@/views/modules/chexingxinxi/list'
    import gaiqiandingdan from '@/views/modules/gaiqiandingdan/list'
    import yonghu from '@/views/modules/yonghu/list'
    import goupiaodingdan from '@/views/modules/goupiaodingdan/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
          ,{
	path: '/news',
        name: '火车资讯',
        component: news
      }
          ,{
	path: '/tuipiaodingdan',
        name: '退票订单',
        component: tuipiaodingdan
      }
          ,{
	path: '/checixinxi',
        name: '车次信息',
        component: checixinxi
      }
          ,{
	path: '/chexingxinxi',
        name: '车型信息',
        component: chexingxinxi
      }
          ,{
	path: '/gaiqiandingdan',
        name: '改签订单',
        component: gaiqiandingdan
      }
          ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
          ,{
	path: '/goupiaodingdan',
        name: '购票订单',
        component: goupiaodingdan
      }
          ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
        ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
