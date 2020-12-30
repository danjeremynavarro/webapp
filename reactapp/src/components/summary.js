import React from 'react';
import {BoldText as B} from './styles/theme';

const enums = {
    frappe: <a href="https://frappe.io/">Frappe Framework</a>,
    erpnext: <a href="https://erpnext.com/">Erpnext</a>    
}


const content = {
    software:( 
        <ul>
            <li>
                Full stack development using <B>{enums.frappe}</B> that uses Python and Javascript. Customized 
                a self-hosted instance of <B>{enums.erpnext}</B> using feedback and suggestions from
                users.
            </li>
            <li>
                Full stack development using NodeJs connected to a Mariadb database with custom api that allows connection through Rest API to any
                apps running on <B>{enums.frappe}.</B>
            </li>
            <li>
                Written code on <B>Classic ASP</B> running Javascript.
            </li>
            <li>
                Written server scripts using <B>Powershell and Bash</B>.
            </li>
            <li>
                Experience with version control such as <B>Git</B>
            </li>
            <li>
                Experience with following languages: <B>Python, Javascript, Java, HTML, CSS, SQL, Bash, and Powershell.</B>
            </li>
            <li>
                Experience with following web technologies: <B>Nodejs, Bootstrap, Jquery, Rest APIs and React.</B>
            </li>
        </ul>
    ),
    networkSystems:(
        <ul>
            <li>
                Network design between remote offices that includes proper IP addressing, point to point connections,
                wireless networks and secure wan connections using VPNs.
            </li>
            <li>
                Experience with configuration and management of virtualization technologies such as <B>VMware Hypervisor and Microsoft Hyper-V.</B>
            </li>
            <li>
                Experience managing servers on <B>Google Cloud</B> and other cloud based providers.
            </li>
            <li>
                Configuration and management of Windows Server services such as <B>Active Directory, Group policy, NPS, File Servers, IIS etc. </B>
            </li>
            <li>
                Management of Debian based distributions <B>(Ubuntu, Mint)</B> with some experience in RHEL linux distribution <B>(CentOs)</B>
            </li>
            <li>
                LAN network configuration<B>(VLANs)</B> to segregate different networks.
            </li>
            <li>
                WAN network configurations<B>(VPNs)</B> for connections between remote offices and cloud services.
            </li>
            <li>
                Management of linux based services such as <B>ERPNext, Nginx and Squid proxy.</B>
            </li>
            <li>
                Experience with different firewall providers such as <B>pfSense, Fortigate, Checkpoint, Cisco and Sonicwall.</B>
            </li>
        </ul>
    ),
}

export default class Experience extends React.Component{
    render (){
        return (
            <div className="card border-seondary mb-3">
                <div className="card-header">Summary</div>
                <div className="card-body">
                    <h4 className="card-title">Software:</h4>
                    {content.software}
                </div>
                <div className="card-body">
                    <h4 className="card-title">Network and Systems:</h4>
                    {content.networkSystems}
                </div>
            </div>
        )
    }
}