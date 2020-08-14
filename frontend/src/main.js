import Vue from 'vue';
import './plugins/axios';
import '@mdi/font/css/materialdesignicons.css'; // Ensure you are using css-loader
import App from './App1.vue';
import vuetify from './plugins/vuetify';
import router from './router';

Vue.config.productionTip = false;

new Vue({
  vuetify,
  router,
  render: (h) => h(App),
}).$mount('#app');
