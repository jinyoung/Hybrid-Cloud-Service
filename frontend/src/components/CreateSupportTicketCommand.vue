<template>

    <v-card outlined>
        <v-card-title>
            CreateSupportTicket
        </v-card-title>

        <v-card-text>
            <String label="TicketId" v-model="value.ticketId" :editMode="editMode"/>
            <String label="CustomerId" v-model="value.customerId" :editMode="editMode"/>
            <String label="TicketSeverity" v-model="value.ticketSeverity" :editMode="editMode"/>
            <String label="TicketDescription" v-model="value.ticketDescription" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="createSupportTicket"
            >
                CreateSupportTicket
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
        name: 'CreateSupportTicketCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.ticketId = '';
            this.value.customerId = '';
            this.value.ticketSeverity = '';
            this.value.ticketDescription = '';
        },
        watch: {
        },
        methods: {
            createSupportTicket() {
                this.$emit('createSupportTicket', this.value);
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

