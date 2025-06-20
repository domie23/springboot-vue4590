import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Messages from '../pages/messages/list'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import yonghuList from '../pages/yonghu/list'
import yonghuDetail from '../pages/yonghu/detail'
import yonghuAdd from '../pages/yonghu/add'
import cheliangxinxiList from '../pages/cheliangxinxi/list'
import cheliangxinxiDetail from '../pages/cheliangxinxi/detail'
import cheliangxinxiAdd from '../pages/cheliangxinxi/add'
import shiqiecheliangList from '../pages/shiqiecheliang/list'
import shiqiecheliangDetail from '../pages/shiqiecheliang/detail'
import shiqiecheliangAdd from '../pages/shiqiecheliang/add'
import gaosushoufeiList from '../pages/gaosushoufei/list'
import gaosushoufeiDetail from '../pages/gaosushoufei/detail'
import gaosushoufeiAdd from '../pages/gaosushoufei/add'
import cheliangweizhangList from '../pages/cheliangweizhang/list'
import cheliangweizhangDetail from '../pages/cheliangweizhang/detail'
import cheliangweizhangAdd from '../pages/cheliangweizhang/add'
import aboutusList from '../pages/aboutus/list'
import aboutusDetail from '../pages/aboutus/detail'
import aboutusAdd from '../pages/aboutus/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'messages',
					component: Messages
				},
				{
					path: 'news',
					component: News
				},
				{
					path: 'newsDetail',
					component: NewsDetail
				},
				{
					path: 'yonghu',
					component: yonghuList
				},
				{
					path: 'yonghuDetail',
					component: yonghuDetail
				},
				{
					path: 'yonghuAdd',
					component: yonghuAdd
				},
				{
					path: 'cheliangxinxi',
					component: cheliangxinxiList
				},
				{
					path: 'cheliangxinxiDetail',
					component: cheliangxinxiDetail
				},
				{
					path: 'cheliangxinxiAdd',
					component: cheliangxinxiAdd
				},
				{
					path: 'shiqiecheliang',
					component: shiqiecheliangList
				},
				{
					path: 'shiqiecheliangDetail',
					component: shiqiecheliangDetail
				},
				{
					path: 'shiqiecheliangAdd',
					component: shiqiecheliangAdd
				},
				{
					path: 'gaosushoufei',
					component: gaosushoufeiList
				},
				{
					path: 'gaosushoufeiDetail',
					component: gaosushoufeiDetail
				},
				{
					path: 'gaosushoufeiAdd',
					component: gaosushoufeiAdd
				},
				{
					path: 'cheliangweizhang',
					component: cheliangweizhangList
				},
				{
					path: 'cheliangweizhangDetail',
					component: cheliangweizhangDetail
				},
				{
					path: 'cheliangweizhangAdd',
					component: cheliangweizhangAdd
				},
				{
					path: 'aboutus',
					component: aboutusList
				},
				{
					path: 'aboutusDetail',
					component: aboutusDetail
				},
				{
					path: 'aboutusAdd',
					component: aboutusAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
