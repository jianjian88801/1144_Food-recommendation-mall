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

     import users from '@/views/modules/users/list'
    import cart from '@/views/modules/cart/list'
    import dictionary from '@/views/modules/dictionary/list'
    import gonggao from '@/views/modules/gonggao/list'
    import liuyan from '@/views/modules/liuyan/list'
    import meishi from '@/views/modules/meishi/list'
    import meishiCollection from '@/views/modules/meishiCollection/list'
    import meishiCommentback from '@/views/modules/meishiCommentback/list'
    import meishiOrder from '@/views/modules/meishiOrder/list'
    import shangjia from '@/views/modules/shangjia/list'
    import yonghu from '@/views/modules/yonghu/list'
    import config from '@/views/modules/config/list'
    import dictionaryGonggao from '@/views/modules/dictionaryGonggao/list'
    import dictionaryHuiyuandengji from '@/views/modules/dictionaryHuiyuandengji/list'
    import dictionaryMeishi from '@/views/modules/dictionaryMeishi/list'
    import dictionaryMeishiCollection from '@/views/modules/dictionaryMeishiCollection/list'
    import dictionaryMeishiOrder from '@/views/modules/dictionaryMeishiOrder/list'
    import dictionaryMeishiOrderPayment from '@/views/modules/dictionaryMeishiOrderPayment/list'
    import dictionarySex from '@/views/modules/dictionarySex/list'
    import dictionaryShangjiaXingji from '@/views/modules/dictionaryShangjiaXingji/list'
    import dictionaryShangxia from '@/views/modules/dictionaryShangxia/list'





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
    } ,{
        path: '/users',
        name: '管理信息',
        component: users
      }
    ,{
        path: '/dictionaryGonggao',
        name: '公告类型',
        component: dictionaryGonggao
    }
    ,{
        path: '/dictionaryHuiyuandengji',
        name: '会员等级类型',
        component: dictionaryHuiyuandengji
    }
    ,{
        path: '/dictionaryMeishi',
        name: '美食类型',
        component: dictionaryMeishi
    }
    ,{
        path: '/dictionaryMeishiCollection',
        name: '收藏表类型',
        component: dictionaryMeishiCollection
    }
    ,{
        path: '/dictionaryMeishiOrder',
        name: '订单类型',
        component: dictionaryMeishiOrder
    }
    ,{
        path: '/dictionaryMeishiOrderPayment',
        name: '订单支付类型',
        component: dictionaryMeishiOrderPayment
    }
    ,{
        path: '/dictionarySex',
        name: '性别类型',
        component: dictionarySex
    }
    ,{
        path: '/dictionaryShangjiaXingji',
        name: '商家星级类型',
        component: dictionaryShangjiaXingji
    }
    ,{
        path: '/dictionaryShangxia',
        name: '上下架',
        component: dictionaryShangxia
    }
    ,{
        path: '/config',
        name: '轮播图',
        component: config
    }


    ,{
        path: '/cart',
        name: '购物车',
        component: cart
      }
    ,{
        path: '/dictionary',
        name: '字典',
        component: dictionary
      }
    ,{
        path: '/gonggao',
        name: '公告信息',
        component: gonggao
      }
    ,{
        path: '/liuyan',
        name: '留言板',
        component: liuyan
      }
    ,{
        path: '/meishi',
        name: '美食',
        component: meishi
      }
    ,{
        path: '/meishiCollection',
        name: '美食收藏',
        component: meishiCollection
      }
    ,{
        path: '/meishiCommentback',
        name: '美食评价',
        component: meishiCommentback
      }
    ,{
        path: '/meishiOrder',
        name: '美食订单',
        component: meishiOrder
      }
    ,{
        path: '/shangjia',
        name: '商家',
        component: shangjia
      }
    ,{
        path: '/yonghu',
        name: '用户',
        component: yonghu
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
