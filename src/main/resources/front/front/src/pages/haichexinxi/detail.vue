<template>
<div>
	<div :style='{"padding":"12px","boxShadow":"0 0px 6px #999","margin":"0px auto","borderColor":"#fff","borderRadius":"0px","background":"linear-gradient(180deg, #eee 0%, #fff 32%, #eee 100%)","borderWidth":"1px 0 1px 0","width":"100%","borderStyle":"solid"}' class="breadcrumb-preview">
		<el-breadcrumb :separator="'Ξ'" :style='{"width":"1200px","margin":"0 auto","fontSize":"14px","lineHeight":"1"}'>
			<el-breadcrumb-item>首页</el-breadcrumb-item>
			<el-breadcrumb-item v-for="(item, index) in breadcrumbItem" :key="index">{{item.name}}</el-breadcrumb-item>
		</el-breadcrumb>
	</div>
	
	<div class="detail-preview" :style='{"width":"1200px","padding":"0 0 24px","margin":"0px auto","position":"relative"}'>
		<div class="attr" :style='{"border":"1px solid #dfdfdf","padding":"16px 16px 20px 16px","boxShadow":"1px 2px 3px #eee","margin":"20px 0 20px 0","overflow":"hidden","borderRadius":"16px","background":"#fff","position":"relative"}'>
			<el-carousel :style='{"width":"540px","margin":"0 0px 0 0","float":"right","height":"400px"}' trigger="click" indicator-position="inside" arrow="always" type="default" direction="horizontal" height="400px" autoplay="true" interval="3000" loop="true">
				<el-carousel-item :style='{"borderRadius":"10px","width":"100%","height":"100%"}' v-for="item in detailBanner" :key="item.id">
					<el-image :style='{"objectFit":"cover","width":"100%","height":"100%"}' v-if="item.substr(0,4)=='http'" :src="item" fit="cover" class="image"></el-image>
					<el-image :style='{"objectFit":"cover","width":"100%","height":"100%"}' v-else :src="baseUrl + item" fit="cover" class="image"></el-image>
				</el-carousel-item>
			</el-carousel>
	
			
			<div class="info" :style='{"minHeight":"520px","width":"600px","padding":"0px 0 20px","margin":"0px","float":"left","background":"#fff"}'>
				<div class="item" :style='{"border":"0px solid #eee","padding":"10px 10px","boxShadow":"1px 2px 6px #8dd2eb","margin":"0 0 10px 0","alignItems":"center","borderRadius":"8px","background":"radial-gradient(circle, rgba(55,170,250,1) 25%, rgba(63,94,251,1) 100%),rgb(63,201,251)","display":"flex","justifyContent":"space-between"}'>
					<div :style='{"color":"#fff","fontSize":"16px"}'>
                    {{detail.chepaihao}}
                    </div>
				</div>

				<div class="item" :style='{"border":"1px solid #dfdfdf","padding":"0px 10px","boxShadow":"1px 2px 3px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"radial-gradient(circle, rgba(246,246,246,1) 0%, rgba(230,230,230,1) 100%)","display":"flex","justifyContent":"spaceBetween"}'>
					<div class="lable" :style='{"width":"120px","padding":"0 10px","fontSize":"14px","lineHeight":"40px","color":"#666","textAlign":"right"}'>订单编号</div>
					<div  :style='{"width":"498px","padding":"8px 10px 0","fontSize":"14px","lineHeight":"24px","color":"#999","height":"auto"}'>{{detail.dingdanbianhao}}</div>
				</div>
				<div class="item" :style='{"border":"1px solid #dfdfdf","padding":"0px 10px","boxShadow":"1px 2px 3px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"radial-gradient(circle, rgba(246,246,246,1) 0%, rgba(230,230,230,1) 100%)","display":"flex","justifyContent":"spaceBetween"}'>
					<div class="lable" :style='{"width":"120px","padding":"0 10px","fontSize":"14px","lineHeight":"40px","color":"#666","textAlign":"right"}'>车辆品牌</div>
					<div  :style='{"width":"498px","padding":"8px 10px 0","fontSize":"14px","lineHeight":"24px","color":"#999","height":"auto"}'>{{detail.cheliangpinpai}}</div>
				</div>
				<div class="item" :style='{"border":"1px solid #dfdfdf","padding":"0px 10px","boxShadow":"1px 2px 3px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"radial-gradient(circle, rgba(246,246,246,1) 0%, rgba(230,230,230,1) 100%)","display":"flex","justifyContent":"spaceBetween"}'>
					<div class="lable" :style='{"width":"120px","padding":"0 10px","fontSize":"14px","lineHeight":"40px","color":"#666","textAlign":"right"}'>汽车类别</div>
					<div  :style='{"width":"498px","padding":"8px 10px 0","fontSize":"14px","lineHeight":"24px","color":"#999","height":"auto"}'>{{detail.qicheleibie}}</div>
				</div>
				<div class="item" :style='{"border":"1px solid #dfdfdf","padding":"0px 10px","boxShadow":"1px 2px 3px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"radial-gradient(circle, rgba(246,246,246,1) 0%, rgba(230,230,230,1) 100%)","display":"flex","justifyContent":"spaceBetween"}'>
					<div class="lable" :style='{"width":"120px","padding":"0 10px","fontSize":"14px","lineHeight":"40px","color":"#666","textAlign":"right"}'>还车日期</div>
					<div  :style='{"width":"498px","padding":"8px 10px 0","fontSize":"14px","lineHeight":"24px","color":"#999","height":"auto"}'>{{detail.haicheriqi}}</div>
				</div>
				<div class="item" :style='{"border":"1px solid #dfdfdf","padding":"0px 10px","boxShadow":"1px 2px 3px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"radial-gradient(circle, rgba(246,246,246,1) 0%, rgba(230,230,230,1) 100%)","display":"flex","justifyContent":"spaceBetween"}'>
					<div class="lable" :style='{"width":"120px","padding":"0 10px","fontSize":"14px","lineHeight":"40px","color":"#666","textAlign":"right"}'>还车备注</div>
					<div  :style='{"width":"498px","padding":"8px 10px 0","fontSize":"14px","lineHeight":"24px","color":"#999","height":"auto"}'>{{detail.haichebeizhu}}</div>
				</div>
				<div class="item" :style='{"border":"1px solid #dfdfdf","padding":"0px 10px","boxShadow":"1px 2px 3px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"radial-gradient(circle, rgba(246,246,246,1) 0%, rgba(230,230,230,1) 100%)","display":"flex","justifyContent":"spaceBetween"}'>
					<div class="lable" :style='{"width":"120px","padding":"0 10px","fontSize":"14px","lineHeight":"40px","color":"#666","textAlign":"right"}'>账号</div>
					<div  :style='{"width":"498px","padding":"8px 10px 0","fontSize":"14px","lineHeight":"24px","color":"#999","height":"auto"}'>{{detail.zhanghao}}</div>
				</div>
				<div class="item" :style='{"border":"1px solid #dfdfdf","padding":"0px 10px","boxShadow":"1px 2px 3px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"radial-gradient(circle, rgba(246,246,246,1) 0%, rgba(230,230,230,1) 100%)","display":"flex","justifyContent":"spaceBetween"}'>
					<div class="lable" :style='{"width":"120px","padding":"0 10px","fontSize":"14px","lineHeight":"40px","color":"#666","textAlign":"right"}'>姓名</div>
					<div  :style='{"width":"498px","padding":"8px 10px 0","fontSize":"14px","lineHeight":"24px","color":"#999","height":"auto"}'>{{detail.xingming}}</div>
				</div>
				<div class="item" :style='{"border":"1px solid #dfdfdf","padding":"0px 10px","boxShadow":"1px 2px 3px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"radial-gradient(circle, rgba(246,246,246,1) 0%, rgba(230,230,230,1) 100%)","display":"flex","justifyContent":"spaceBetween"}'>
					<div class="lable" :style='{"width":"120px","padding":"0 10px","fontSize":"14px","lineHeight":"40px","color":"#666","textAlign":"right"}'>手机</div>
					<div  :style='{"width":"498px","padding":"8px 10px 0","fontSize":"14px","lineHeight":"24px","color":"#999","height":"auto"}'>{{detail.shouji}}</div>
				</div>
				<div class="item" :style='{"border":"1px solid #dfdfdf","padding":"0px 10px","boxShadow":"1px 2px 3px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"radial-gradient(circle, rgba(246,246,246,1) 0%, rgba(230,230,230,1) 100%)","display":"flex","justifyContent":"spaceBetween"}'>
					<div class="lable" :style='{"width":"120px","padding":"0 10px","fontSize":"14px","lineHeight":"40px","color":"#666","textAlign":"right"}'>身份证</div>
					<div  :style='{"width":"498px","padding":"8px 10px 0","fontSize":"14px","lineHeight":"24px","color":"#999","height":"auto"}'>{{detail.shenfenzheng}}</div>
				</div>
				<div class="item" :style='{"border":"1px solid #dfdfdf","padding":"0px 10px","boxShadow":"1px 2px 3px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"radial-gradient(circle, rgba(246,246,246,1) 0%, rgba(230,230,230,1) 100%)","display":"flex","justifyContent":"spaceBetween"}'>
					<div class="lable" :style='{"width":"120px","padding":"0 10px","fontSize":"14px","lineHeight":"40px","color":"#666","textAlign":"right"}'>管理账号</div>
					<div  :style='{"width":"498px","padding":"8px 10px 0","fontSize":"14px","lineHeight":"24px","color":"#999","height":"auto"}'>{{detail.guanlizhanghao}}</div>
				</div>
				<div class="item" :style='{"border":"1px solid #dfdfdf","padding":"0px 10px","boxShadow":"1px 2px 3px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"radial-gradient(circle, rgba(246,246,246,1) 0%, rgba(230,230,230,1) 100%)","display":"flex","justifyContent":"spaceBetween"}'>
					<div class="lable" :style='{"width":"120px","padding":"0 10px","fontSize":"14px","lineHeight":"40px","color":"#666","textAlign":"right"}'>管理姓名</div>
					<div  :style='{"width":"498px","padding":"8px 10px 0","fontSize":"14px","lineHeight":"24px","color":"#999","height":"auto"}'>{{detail.guanlixingming}}</div>
				</div>
				<div class="btn" :style='{"padding":"10px 0","flexWrap":"wrap","display":"flex"}'>
					<el-button :style='{"border":"0","cursor":"pointer","padding":"0 10px","margin":"0 5px 0 0","outline":"none","color":"#fff","borderRadius":"4px","background":"rgba(64, 158, 255, 1)","width":"auto","lineHeight":"40px","fontSize":"14px","height":"40px"}' v-if="isAuth('haichexinxi','审核')" @click="onSH" type="warning">审核</el-button>
				</div>
			</div>
			
		</div>
		
		
		<el-tabs class="detail" :style='{"border":"1px solid #dfdfdf","minHeight":"350px","boxShadow":"1px 2px 3px #eee","padding":"16px","borderRadius":"16px","background":"#FFF"}' v-model="activeName" type="border-card">
		</el-tabs>
		<el-dialog title="审核" :visible.sync="sfshVisiable" width="50%">
			<el-form ref="shForm" :model="shForm" label-width="80px">
				<el-form-item label="审核状态">
					<el-select v-model="shForm.sfsh" placeholder="审核状态">
						<el-option label="通过" value="是"></el-option>
						<el-option label="不通过" value="否"></el-option>
						<el-option label="待审核" value="待审核"></el-option>
					</el-select>
				</el-form-item>
				<el-form-item label="内容">
					<el-input type="textarea" :rows="8" v-model="shForm.shhf"></el-input>
				</el-form-item>
			</el-form>
			<div slot="footer" class="dialog-footer">
				<el-button @click="sfshVisiable = false">取 消</el-button>
				<el-button type="primary" @click="shHandler">确 定</el-button>
			</div>
		</el-dialog>
	</div>
</div>
</template>

<script>
  import CountDown from '@/components/CountDown';
  export default {
    //数据集合
    data() {
      return {
        tablename: 'haichexinxi',
        baseUrl: '',
        breadcrumbItem: [
          {
            name: '详情信息'
          }
        ],
        title: '',
        detailBanner: [],
        endTime: 0,
        detail: {},
        activeName: 'first',
        total: 1,
        pageSize: 5,
		pageSizes: [10,20,30,50],
        totalPage: 1,
        rules: {
          content: [
            { required: true, message: '请输入内容', trigger: 'blur' }
          ]
        },
        buynumber: 1,
        sfshVisiable: false,
        shForm: {
          sfsh: '是',
          shhf: ''
        },
      }
    },
    created() {
        this.init();
    },
    //方法集合
    methods: {
        init() {
          this.baseUrl = this.$config.baseUrl;
          if(this.$route.query.detailObj) {
            this.detail = JSON.parse(this.$route.query.detailObj);
          }
          this.$http.get(this.tablename + '/detail/'  + this.detail.id, {}).then(res => {
            if (res.data.code == 0) {
              this.detail = res.data.data;
              this.title = this.detail.chepaihao;
              this.$forceUpdate();
            }
          });


        },
      onSH() {
        this.sfshVisiable = true;
      },
      shHandler(){
        this.$confirm(`确定操作?`, "提示", {
          confirmButtonText: "确定",
          cancelButtonText: "取消",
          type: "warning"
        }).then(() => {
          this.detail.sfsh = this.shForm.sfsh;
          this.detail.shhf = this.shForm.shhf;
          this.$http.post(`${this.tablename}/update`, this.detail).then(res => {
            if (res.data.code == 0) {
              this.sfshVisiable = false;
              this.$message({
                message: "操作成功",
                type: "success",
                duration: 1500,
              });
            }
          });
        });
      },
      curChange(page) {
        this.getDiscussList(page);
      },
      prevClick(page) {
        this.getDiscussList(page);
      },
      nextClick(page) {
        this.getDiscussList(page);
      },
      // 下载
      download(file){
        if(!file) {
            this.$message({
              type: 'error',
              message: '文件不存在',
              duration: 1500,
            });
            return;
        }
        window.open(this.baseUrl+file)
      },


    },
    components: {
      CountDown
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.detail-preview {
	
	  .attr {
	    .el-carousel /deep/ .el-carousel__indicator button {
	      width: 0;
	      height: 0;
	      display: none;
	    }
	
	    .el-input-number__decrease:hover:not(.is-disabled)~.el-input .el-input__inner:not(.is-disabled), .el-input-number__increase:hover:not(.is-disabled)~.el-input .el-input__inner:not(.is-disabled) {
	      border-color: none;
	    }
	  }
	
	  .detail {
	    & /deep/ .el-tabs__header .el-tabs__nav-wrap {
	      margin-bottom: 0;
	    }
	
	    & .add .el-textarea {
	      width: auto;
	    }
	  }
	}
	
	.attr .el-carousel /deep/ .el-carousel__container .el-carousel__arrow--left {
		width: 36px;
		font-size: 12px;
		height: 36px;
	}
	
	.attr .el-carousel /deep/ .el-carousel__container .el-carousel__arrow--left:hover {
		background: #278bd5;
	}
	
	.attr .el-carousel /deep/ .el-carousel__container .el-carousel__arrow--right {
		width: 36px;
		font-size: 12px;
		height: 36px;
	}
	
	.attr .el-carousel /deep/ .el-carousel__container .el-carousel__arrow--right:hover {
		background: #278bd5;
	}

	.attr .el-carousel /deep/ .el-carousel__indicators {
		padding: 0;
		margin: 0 0 8px 0;
		z-index: 2;
		position: absolute;
		list-style: none;
	}
	
	.attr .el-carousel /deep/ .el-carousel__indicators li {
		border-radius: 50%;
		padding: 0;
		margin: 0 4px;
		background: #fff;
		display: inline-block;
		width: 12px;
		opacity: 0.4;
		transition: 0.3s;
		height: 12px;
	}
	
	.attr .el-carousel /deep/ .el-carousel__indicators li:hover {
		border-radius: 50%;
		padding: 0;
		margin: 0 4px;
		background: #fff;
		display: inline-block;
		width: 12px;
		opacity: 0.7;
		height: 12px;
	}
	
	.attr .el-carousel /deep/ .el-carousel__indicators li.is-active {
		border-radius: 50%;
		padding: 0;
		margin: 0 4px;
		background: #fff;
		display: inline-block;
		width: 12px;
		opacity: 1;
		height: 12px;
	}
	
	.attr .el-input-number /deep/ .el-input-number__decrease {
		cursor: pointer;
		z-index: 1;
		display: flex;
		border-color: #DCDFE6;
		border-radius: 4px 0 0 4px;
		top: 1px;
		left: 1px;
		background: #f5f5f5;
		width: 40px;
		justify-content: center;
		border-width: 0 1px 0 0;
		align-items: center;
		position: absolute;
		border-style: solid;
		text-align: center;
		height: 38px;
	}
	
	.attr .el-input-number /deep/ .el-input-number__decrease i {
		color: #666;
		font-size: 14px;
	}

	.attr .el-input-number /deep/ .el-input-number__increase {
		cursor: pointer;
		z-index: 1;
		display: flex;
		border-color: #DCDFE6;
		right: 1px;
		border-radius: 0 4px 4px 0;
		top: 1px;
		background: #f5f5f5;
		width: 40px;
		justify-content: center;
		border-width: 0 0 0 1px;
		align-items: center;
		position: absolute;
		border-style: solid;
		text-align: center;
		height: 38px;
	}
	
	.attr .el-input-number /deep/ .el-input-number__increase i {
		color: #666;
		font-size: 14px;
	}
	
	.attr .el-input-number /deep/ .el-input .el-input__inner {
		border: 1px solid #DCDFE6;
		border-radius: 4px;
		padding: 0 40px;
		outline: none;
		color: #666;
		background: #FFF;
		display: inline-block;
		width: 100%;
		font-size: 14px;
		line-height: 40px;
		text-align: center;
		height: 40px;
	}
	
	.detail-preview .detail.el-tabs /deep/ .el-tabs__header {
		border-radius: 8px;
		padding: 4px 6px;
		margin: 0;
		background: radial-gradient(circle, rgba(63,201,251,1) 50%, rgba(63,94,251,1) 100%),rgb(63,201,251);
		border-color: #E4E7ED;
		border-width: 0 0 0px 0;
		border-style: solid;
	}
	
	.detail-preview .detail.el-tabs /deep/ .el-tabs__header .el-tabs__item {
		border: 0;
		padding: 0 16px;
		margin: 0 4px 0 4px;
		color: #fff;
		font-weight: 500;
		display: inline-block;
		font-size: 14px;
		line-height: 32px;
		border-radius: 50%;
		background: transparent;
		position: relative;
		list-style: none;
		height: 32px;
	}
	
	.detail-preview .detail.el-tabs /deep/ .el-tabs__header .el-tabs__item:hover {
		border: 0;
		border-radius: 50%;
		padding: 0 16px;
		margin: 0 4px 0 4px;
		color: #409EFF;
		background: #f3f9fe;
		line-height: 32px;
		height: 32px;
	}
	
	.detail-preview .detail.el-tabs /deep/ .el-tabs__header .el-tabs__item.is-active {
		border: 0;
		border-radius: 50%;
		padding: 0 16px;
		margin: 0 4px 0 4px;
		color: #409EFF;
		background: #f3f9fe;
		line-height: 32px;
		height: 32px;
	}
	
	.detail-preview .detail.el-tabs /deep/ .el-tabs__content {
		padding: 15px;
	}
	
	.detail-preview .detail.el-tabs .add /deep/ .el-form-item__label {
		padding: 0 10px 0 0;
		color: #666;
		width: 80px;
		font-size: 14px;
		line-height: 40px;
		text-align: right;
	}
	
	.detail-preview .detail.el-tabs .add /deep/ .el-textarea__inner {
		border: 0;
		border-radius: 4px;
		padding: 4px 12px;
		box-shadow: 0 0 0px rgba(64, 158, 255, .5);
		outline: none;
		color: #333;
		background: none;
		width: 1058px;
		font-size: 14px;
		min-height: 200px;
		line-height: 32px;
		height: 200px;
	}
	
	.breadcrumb-preview .el-breadcrumb /deep/ .el-breadcrumb__separator {
		margin: 0 9px;
		color: #ccc;
		font-weight: 500;
	}
	
	.breadcrumb-preview .el-breadcrumb /deep/ .el-breadcrumb__inner a {
		color: #333;
		display: inline-block;
	}

	.breadcrumb-preview .el-breadcrumb /deep/ .el-breadcrumb__inner {
		color: #999;
		display: inline-block;
	}
	
	.el-pagination /deep/ .el-pagination__total {
		margin: 0 10px 0 0;
		color: #666;
		font-weight: 400;
		display: inline-block;
		vertical-align: top;
		font-size: 13px;
		line-height: 28px;
		height: 28px;
	}
	
	.el-pagination /deep/ .btn-prev {
		border: none;
		border-radius: 2px;
		padding: 0;
		margin: 0 5px;
		color: #666;
		background: #f4f4f5;
		display: inline-block;
		vertical-align: top;
		font-size: 13px;
		line-height: 28px;
		min-width: 35px;
		height: 28px;
	}
	
	.el-pagination /deep/ .btn-next {
		border: none;
		border-radius: 2px;
		padding: 0;
		margin: 0 5px;
		color: #666;
		background: #f4f4f5;
		display: inline-block;
		vertical-align: top;
		font-size: 13px;
		line-height: 28px;
		min-width: 35px;
		height: 28px;
	}
	
	.el-pagination /deep/ .btn-prev:disabled {
		border: none;
		cursor: not-allowed;
		border-radius: 2px;
		padding: 0;
		margin: 0 5px;
		color: #C0C4CC;
		background: #f4f4f5;
		display: inline-block;
		vertical-align: top;
		font-size: 13px;
		line-height: 28px;
		height: 28px;
	}
	
	.el-pagination /deep/ .btn-next:disabled {
		border: none;
		cursor: not-allowed;
		border-radius: 2px;
		padding: 0;
		margin: 0 5px;
		color: #C0C4CC;
		background: #f4f4f5;
		display: inline-block;
		vertical-align: top;
		font-size: 13px;
		line-height: 28px;
		height: 28px;
	}
	
	.el-pagination /deep/ .el-pager {
		padding: 0;
		margin: 0;
		display: inline-block;
		vertical-align: top;
	}
	
	.el-pagination /deep/ .el-pager .number {
		cursor: pointer;
		padding: 0 4px;
		margin: 0 5px;
		color: #666;
		display: inline-block;
		vertical-align: top;
		font-size: 13px;
		line-height: 28px;
		border-radius: 2px;
		background: #f4f4f5;
		text-align: center;
		min-width: 30px;
		height: 28px;
	}
	
	.el-pagination /deep/ .el-pager .number:hover {
		cursor: pointer;
		padding: 0 4px;
		margin: 0 5px;
		color: #409EFF;
		display: inline-block;
		vertical-align: top;
		font-size: 13px;
		line-height: 28px;
		border-radius: 2px;
		background: #f4f4f5;
		text-align: center;
		min-width: 30px;
		height: 28px;
}

.el-pagination /deep/ .el-pager .number.active {
		cursor: default;
		padding: 0 4px;
		margin: 0 5px;
		color: #FFF;
		display: inline-block;
		vertical-align: top;
		font-size: 13px;
		line-height: 28px;
		border-radius: 2px;
		background: #409EFF;
		text-align: center;
		min-width: 30px;
		height: 28px;
	}
	
	.el-pagination /deep/ .el-pagination__sizes {
		display: inline-block;
		vertical-align: top;
		font-size: 13px;
		line-height: 28px;
		height: 28px;
	}
	
	.el-pagination /deep/ .el-pagination__sizes .el-input {
		margin: 0 5px;
		width: 100px;
		position: relative;
	}
	
	.el-pagination /deep/ .el-pagination__sizes .el-input .el-input__inner {
		border: 1px solid #DCDFE6;
		cursor: pointer;
		padding: 0 25px 0 8px;
		color: #606266;
		display: inline-block;
		font-size: 13px;
		line-height: 28px;
		border-radius: 3px;
		outline: 0;
		background: #FFF;
		width: 100%;
		text-align: center;
		height: 28px;
	}
	
	.el-pagination /deep/ .el-pagination__sizes .el-input span.el-input__suffix {
		top: 0;
		position: absolute;
		right: 0;
		height: 100%;
	}
	
	.el-pagination /deep/ .el-pagination__sizes .el-input .el-input__suffix .el-select__caret {
		cursor: pointer;
		color: #C0C4CC;
		width: 25px;
		font-size: 14px;
		line-height: 28px;
		text-align: center;
	}

	.el-pagination /deep/ .el-pagination__jump {
		margin: 0 0 0 24px;
		color: #606266;
		display: inline-block;
		vertical-align: top;
		font-size: 13px;
		line-height: 28px;
		height: 28px;
	}
	
	.el-pagination /deep/ .el-pagination__jump .el-input {
		border-radius: 3px;
		padding: 0 2px;
		margin: 0 2px;
		display: inline-block;
		width: 50px;
		font-size: 14px;
		line-height: 18px;
		position: relative;
		text-align: center;
		height: 28px;
	}
	
	.el-pagination /deep/ .el-pagination__jump .el-input .el-input__inner {
		border: 1px solid #DCDFE6;
		cursor: pointer;
		padding: 0 3px;
		color: #606266;
		display: inline-block;
		font-size: 14px;
		line-height: 28px;
		border-radius: 3px;
		outline: 0;
		background: #FFF;
		width: 100%;
		text-align: center;
		height: 28px;
	}
</style>
