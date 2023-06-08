<template>

    <v-card outlined>
        <v-card-title>
            CreateCustomer
        </v-card-title>

        <v-card-text>
            <String label="CustomerId" v-model="value.customerId" :editMode="editMode"/>
            <String label="CustomerName" v-model="value.customerName" :editMode="editMode"/>
            <String label="CustomerEmail" v-model="value.customerEmail" :editMode="editMode"/>
            <String label="CustomerPhone" v-model="value.customerPhone" :editMode="editMode"/>
            <String label="CustomerCompany" v-model="value.customerCompany" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="createCustomer"
            >
                CreateCustomer
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
        name: 'CreateCustomerCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.customerId = '';
            this.value.customerName = '';
            this.value.customerEmail = '';
            this.value.customerPhone = '';
            this.value.customerCompany = '';
        },
        watch: {
        },
        methods: {
            createCustomer() {
                this.$emit('createCustomer', this.value);
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

