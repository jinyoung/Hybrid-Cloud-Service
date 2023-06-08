<template>

    <v-card outlined>
        <v-card-title>
            CreateService
        </v-card-title>

        <v-card-text>
            <String label="ServiceId" v-model="value.serviceId" :editMode="editMode"/>
            <String label="ServiceName" v-model="value.serviceName" :editMode="editMode"/>
            <String label="ServiceProvider" v-model="value.serviceProvider" :editMode="editMode"/>
            <String label="ServiceType" v-model="value.serviceType" :editMode="editMode"/>
            <String label="ServiceDescription" v-model="value.serviceDescription" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="createService"
            >
                CreateService
            </v-btn>
            
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'CreateServiceCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.serviceId = '';
            this.value.serviceName = '';
            this.value.serviceProvider = '';
            this.value.serviceType = '';
            this.value.serviceDescription = '';
        },
        watch: {
        },
        methods: {
            createService() {
                this.$emit('createService', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

